package id.rifqipadisiliwangi.JuaraAndroidTIga.ui

import id.rifqipadisiliwangi.JuaraAndroidTIga.data.Email
import id.rifqipadisiliwangi.JuaraAndroidTIga.data.MailboxType
import id.rifqipadisiliwangi.JuaraAndroidTIga.data.local.LocalEmailsDataProvider

data class ReplyUiState(
    val mailboxes: Map<MailboxType, List<Email>> = emptyMap(),
    val currentMailbox: MailboxType = MailboxType.Inbox,
    val currentSelectedEmail: Email = LocalEmailsDataProvider.defaultEmail,
    val isShowingHomepage: Boolean = true
) {
    val currentMailboxEmails: List<Email> by lazy { mailboxes[currentMailbox]!! }
}
